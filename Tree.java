public class Tree{
	double heightFt;
	double trunkDiameterInches;
	TreeType treeType;
	
	Tree(double heightFt, double trunkDiameterInches, TreeType treeType){
		this.heightFt = heightFt;
		this.trunkDiameterInches = trunkDiameterInches;
		this.treeType = treeType;
	}
	
	double grow(){
		this.heightFt += 10;
		this.trunkDiameterInches += 1;
		return (this.heightFt + this.trunkDiameterInches);
	}
}