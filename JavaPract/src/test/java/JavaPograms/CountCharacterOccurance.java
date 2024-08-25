package JavaPograms;
public class CountCharacterOccurance{
    public static void main(String[] args){
        String s = "Java Programming java oops";
        int totalcount = s.length();
        int totalcount_afterRemove = s.replace("a","").length();
        int count = totalcount-totalcount_afterRemove;
        System.out.println("Number of occurence of a is: "+count);
    }
}