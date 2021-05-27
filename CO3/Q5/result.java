package co3q5.java;

 class result extends sports {

	public result(int english,int hindi,int physics,int chemistry,int maths,int runs,int catches,int wicket) {
		super(english,hindi,physics,chemistry,maths,runs,catches,wicket);
		
	}
	void display() {
		System.out.println("*.......Academics........*");
        System.out.println("English:"+this.english);
        System.out.println("Hindi : "+this.hindi);
        System.out.println("Physics : "+this.physics);
        System.out.println("Chemistry : "+this.chemistry);
        System.out.println("Maths : "+this.maths);
        System.out.println("\n");
        System.out.println("*.......Sports........*");
        System.out.println("Participated in cricket");
        System.out.println("Runs scored : "+this.runs);
        System.out.println("Catches : "+this.catches);
        System.out.println("Wickets : "+this.wicket);
        System.out.println("\n");
        
	}

}
