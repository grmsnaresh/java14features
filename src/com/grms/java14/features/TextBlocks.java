package com.grms.java14.features;

public class TextBlocks {

    public static String getHtmlBodyOldApproach () {
        String htmlBody = "<html>"+
                "<head> Hello</head>"+
                "<body> Test body </body>"+
                "</html>";
        return  htmlBody;
    }
    public static String getHtmlBodyNewApproach () {
        /*String htmlBody = """
                   <html>  \s
                    <head>Hello</head>
                    <body>Test body </body>
                </html>
                """;*/

        String htmlBody = """
                We hope you find this tutorial helpful for your Java development using command line tools.\
                You can download the whole project under the Attachments section to experiment yourself. Enter the inputs when requested.\
                The following
                """;

        return htmlBody;
    }

    public static void main(String args[]) {
//        String htmlBody = getHtmlBodyOldApproach();
        String htmlBody = getHtmlBodyNewApproach();
        System.out.println(htmlBody);
    }
}
