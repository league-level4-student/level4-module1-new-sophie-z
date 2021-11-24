package _03_Text_Funkifier;

public class MixedCapsString {

    private String unfunkifiedText;

    public MixedCapsString(String unfunkifiedText) {

        this.unfunkifiedText = unfunkifiedText;

    }

	public Object funkifyText() {
		// TODO Auto-generated method stub
		char[] array = unfunkifiedText.toCharArray();
		String funkifiedText = "";
		for(int i = 0; i<array.length; i++) {
			if(i%2==0 || i==0) {
				array[i] = Character.toLowerCase(array[i]);
			}
			else {
				array[i] = Character.toUpperCase(array[i]);
			}
			funkifiedText += array[i];
		}
		return funkifiedText;
	}

}
