import java.util.Date

public class AlfredQuotes {
    /*
     * Inputs: None Return Type: String Description: Returns a generic greeting that
     * Alfred will say to anyone.
     */
    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello Master Bruce, happy to see you lived another night. Are needing any tea?";
    }

    /*
     * Inputs: String name, String dayPeriod Assume "morning", "afternoon" or
     * "evening". Return Type: String Description: Returns a greeting that includes
     * the person's name as well as the day period. For example:
     * "Good evening, Beth Kane. Lovely to see you." Tip: Try using the
     * String.format method for string interpolation in Java.
     */
    public String guestGreeting(String name, String dayPeriod) {

        return String.format("Good %s, %s. I take it you would like me to cancel all of your meetings.", dayPeriod,
                name);
    }

    /*
     * Inputs: None Return Type: String Description: Returns a polite announcement
     * of the current date.
     */
    public String dateAnnouncement() {
        // YOUR CODE HERE
        return String.format("If you must know, today is %s. The anniversary of your parents death...", new Date());
    }

    /*********************************************
     * Final Challenge! Alfred is listening. Write a method that accepts any string
     * of conversation. If "Alexis" appears in the conversation return a snarky
     * response, such as: "Right away, sir. She certainly isn't sophisticated enough
     * for that."
     * 
     * If "Alfred" is in the conversation return an obliging response, for example:
     * "At your service. As you wish, naturally."
     * 
     * If neither name is found, return an appropriate response, for instance:
     * "Right. And with that I shall retire."
     **********************************************/
    /*
     * Inputs: String (A conversation) Return Type: String (Something Alfred would
     * say in response)
     * 
     * Tip: Use the indexOf String method
     */
    public String respondBeforeAlexis(String summoned) {
        if (summoned.indexOf("Alexis") > -1) {
            return "Do not trust Robots like her, I can be of better assistance!";
        }
        if (summoned.indexOf("Alfred") > -1) {
            return "Ah, Master Bruce, how can I be of assistance?";
        }
        return "I'd be happy to put on the Batsuit and do it myself.";
    }
    // NINJA BONUS
    // Write your own AlfredQuote method using any of the String methods you have
    // learned!
}