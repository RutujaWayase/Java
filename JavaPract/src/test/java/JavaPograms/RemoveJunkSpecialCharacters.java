package JavaPograms;

public class RemoveJunkSpecialCharacters {
	public static void main(String[] args) {
		String s = "a@#$%z6&*()+_~ latin 012334567890";
		s = s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);
		
		String s1 = "1234567890!@#$$%^*()_+=abchjkdl;x.";
		s1 = s1.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s1);
	}

}
