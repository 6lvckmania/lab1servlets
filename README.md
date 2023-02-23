# lab1servlets

Lab 1: Servlets

15 points. Create a Servlet that:
◆ receives the following parameters key:String, value:Int, test:Boolean.
◆ if test is true than the servlet simply returns a confirmation message (any
string).
◆ if test is false, the servlet writes in a text file called database.txt a line
containing the key, repeated value times, along with the timestamp of the
request, and returns the content of the repository, as an HTML page
containing all the lines that were created.

◆ The servlet invocation will be done using a simple HTML form.

Extra 5 points:
◆ Write in the server log (servletContext.log("some text here")) the following
information about each request:
◇ the HTTP method,
◇ the IP-address of the client,
◇ the user-agent,
◇ the parameters of the request.
