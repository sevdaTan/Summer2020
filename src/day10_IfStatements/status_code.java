package day10_IfStatements;

public class status_code {
    /*
    HTTP is the protocol that governs communications between webservers and web clients (i.e. browsers).
Part of the protocol includes a status code returned by the server to tell the browser the status of its most recent page request.
Some of the codes and their meanings arelisted below:

	status codes:
		200, OK
		201, Created
		202, Accepted
		301, Moved Permanently
		303, See Other
		304, Not Modified
		307, Temporary Redirect
		400, Bad Request
		401, Unauthorized
		403, Forbidden
		404, Not Found
		410, Gone
		500, Internal Server Error
		503, Service Unavailable



1. declare an int variable called StatusCode
2. write a if statement that prints out, on a line by itself, the appropriate label from the above list based on status.

					Example:

						if status code = 200

						output: ok

						if status code = 201:

						output: Created

			NOTE: use single if statements ONLY. DO NOT use more that one print statement
     */


    public static void main(String[] args) {

        int code = 404;

        if (code == 200){
            System.out.println("OK");
        }else if (code == 201){
            System.out.println("created");
        }else if (code == 202){
        System.out.println("accepted");
        }else if (code == 301){
            System.out.println("moved permanently");
        }else if (code == 303){
            System.out.println("see other");
        }else if (code == 304){
            System.out.println("not modified");
        }else if (code == 307){
            System.out.println("temporary redirect");
        }else if (code == 400){
            System.out.println("bad request");
        }else if (code == 401){
            System.out.println("unauthorized");
        }else if (code == 403){
            System.out.println("forbidden");
        }else if (code == 404){
            System.out.println("not found");
        }else if (code == 410){
            System.out.println("gone");
        }else if (code == 500){
            System.out.println("internal server error");
        }else {
            System.out.println("service unavailable");
        }



    }
}