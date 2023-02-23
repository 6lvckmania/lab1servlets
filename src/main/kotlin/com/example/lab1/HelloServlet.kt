import jakarta.servlet.annotation.WebServlet
import jakarta.servlet.http.*
import java.io.*
import java.util.*
import java.text.SimpleDateFormat

@WebServlet("/lab1")
class MyServletLab1 : HttpServlet() {

    override fun doGet(request: HttpServletRequest, response: HttpServletResponse) {

        val key = request.getParameter("key")
        val value = request.getParameter("value")?.toIntOrNull()
        val test = request.getParameter("test")?.toBoolean()

        val ipAddress = request.remoteAddr
        val httpMethod = request.method
        val userAgent = request.getHeader("User-Agent")
        val parameters = request.parameterMap.entries.joinToString(", ") { "${it.key}=${it.value[0]}" }
        servletContext.log("$httpMethod request from $ipAddress with User-Agent $userAgent and parameters: $parameters")

        if (test == true) {
            response.contentType = "text/plain"
            response.writer.print("Confirmation message")
        } else {
            val timestamp = SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(Date())
            val line = "$key ".repeat(value ?: 0) + timestamp + "\n"
            val file = File("database.txt")
            file.appendText(line)

            response.contentType = "text/html"
            val writer = response.writer
            writer.println("<html>")
            writer.println("<head><title>Database</title></head>")
            writer.println("<body>")
            writer.println("<h1>Database content:</h1>")
            writer.println("<ul>")
            file.forEachLine { line ->
                writer.println("<li>$line</li>")
            }
            writer.println("</ul>")
            writer.println("</body>")
            writer.println("</html>")
        }
    }
}