public class AlfredTest {
    /*
     * This main method will always be the launch point for a Java application For
     * now, we are using the main to test all our AlfredQuotes methods.
     */
    public static void main(String[] args) {
        // Make an instance of AlfredQuotes to access all it's methods.
        AlfredQuotes alfredBot = new AlfredQuotes();

        // Make some test greetings, providing any necessary data
        String testGreeting = alfredBot.basicGreeting();
        String testGuestGreeting = alfredBot.guestGreeting("Bruce Wayne", "morning");
        String testDateAnnouncement = alfredBot.dateAnnouncement();

        String alexisTest = alfredBot.respondBeforeAlexis("Alexis! Play some Grime.");
        String alfredTest = alfredBot.respondBeforeAlexis("Alfred! Put on Grime and fight my crimes");
        String notRelevantTest = alfredBot
                .respondBeforeAlexis("I'm not the hero they wanted but the one they are getting!");

        // Print the greetings to test.
        System.out.println(testGreeting);

        // Uncomment these one at a time as you implement each method.
        // System.out.println(testGuestGreeting);
        // System.out.println(testDateAnnouncement);
        // System.out.println(alexisTest);
        // System.out.println(alfredTest);
        // System.out.println(notRelevantTest);
    }
}