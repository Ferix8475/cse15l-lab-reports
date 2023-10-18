import java.io.IOException;
import java.net.URI;

class Handler implements URLHandler {
    // The one bit of state on the server: a number that will be manipulated by
    // various requests.
    int lineNum = 1;
    String printer = "";

    public String handleRequest(URI url) {
        if (url.getPath().equals("/")) {
            return String.format(printer);
        } else if (url.getPath().contains("/add-message")) {
                String[] parameters = url.getQuery().split("=");
                if (parameters[0].equals("s=")) {
                    if (lineNum == 1){
                        printer = lineNum + ". " + parameters[1];
                    } else {
                        printer = "\n" + lineNum + ". " + parameters[1];
                    }
                    lineNum += 1;
                    return String.format("Phrase added!");
                }
            }
            return "404 Not Found!";
        }
    
}

class StringServer {
    public static void main(String[] args) throws IOException {
        if(args.length == 0){
            System.out.println("Missing port number! Try any number between 1024 to 49151");
            return;
        }

        int port = Integer.parseInt(args[0]);

        Server.start(port, new Handler());
    }
}
