package _03_Text_Funkifier;

public class BackwardsString implements TextFunkifier {

    private String unfunkifiedText;

    public BackwardsString(String unfunkifiedText) {

        this.unfunkifiedText = unfunkifiedText;

    }

    @Override
    public String funkifyText() {
    	char[] array = unfunkifiedText.toCharArray();
    	String funkifiedText = "";
    	for(int i = array.length-1; i>=0; i--) {
    		funkifiedText += array[i];
    	}
        return funkifiedText;
    }
}
