class Stringsinpool {
    public static void main(String[] args) {
        String s ="Mohammad, shaikh";
        System.out.println(String.join(",","m","o","h","a","m","m","a","d"));
        System.out.println(s.replaceAll("Mohammad","Mohammed"));        
                String[] parts = s.split(", ");
                for (String part : parts) System.out.println(part);{
                    System.out.println(s); 
                }
                        String emptyStr = "";
                        System.out.println(String.format("Name: %s, Age: %d", "Mohammad", 25)); 
                        System.out.println(s.matches("Mohammad,.*")); 
                        System.out.println(s.endsWith("shaikh")); 
                        System.out.println(s.startsWith("Mohammad"));
                        System.out.println(emptyStr.isEmpty()); 
                        System.out.println(s.indexOf("shaikh"));
                        System.out.println(s.contentEquals("Mohammad, shaikh"));
                    }
}