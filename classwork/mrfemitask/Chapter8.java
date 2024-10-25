public class Chapter8{

	public static void main(String...args){
	PackageData packageData = new PackageData();
	System.out.printf("before instatiation %n %s%n", packageData);

	packageData.number = 77;
	packageData.string = "mystery";
	System.out.printf("after instantiation %n %s%n", packageData);

}

}

	class PackageData{

		int number = 12;
		String string = "bola";

		public String toString(){
			return String.format("number = %d; name : %s", number, string);





}
}