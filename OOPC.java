public class OOPC{
	public static void main(String[] args){
		Tree myFavoriteTree = new Tree(25, 5, TreeType.OAK);
		
		System.out.println(myFavoriteTree.treeType);
		System.out.println(myFavoriteTree.grow());
	}
}