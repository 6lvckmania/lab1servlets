# Lab 1: Servlets

15 points. Create a Servlet that:<br/>
◆ receives the following parameters key:String, value:Int, test:Boolean.<br/>
◆ if test is true than the servlet simply returns a confirmation message (any string).<br/>
◆ if test is false, the servlet writes in a text file called database.txt a line containing the key, repeated value times, along with the timestamp of the request, and returns the content of the repository, as an HTML page containing all the lines that were created.<br/>

◆ The servlet invocation will be done using a simple HTML form.<br/>

Extra 5 points:<br/>
◆ Write in the server log (servletContext.log("some text here")) the following information about each request:<br/>
◇ the HTTP method,<br/>
◇ the IP-address of the client,<br/>
◇ the user-agent,<br/>
◇ the parameters of the request.
