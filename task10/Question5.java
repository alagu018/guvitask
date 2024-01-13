package task10;

class Tea{ 
	
	public String ing1;  
	public String ing2;
	public String ing3;
	public String ing4;
	public String basictea;
	
	public void prepareTea(String i1, String i2) { 
		ing1 = i1;
		ing2 = i2;
		basictea = ing2+" "+ing3+" "+ing4;
		System.out.println("Basic tea is prepared by adding : " +basictea);
	}
	
	public void addMilk(String i3) { 
		ing3 = i3;
		
	}
	
	public void addSugar(String i4) { 
		ing4 = i4;
		
	}
}

class BlackTea extends Tea{ 
	
	String blacktea;
	
	public void addSugar(String i4) { 
		ing4 = i4;
		
	}
	
	public void prepareTea(String i1, String i2) { 
		ing1 = i1;
		ing2 = i2;
		blacktea = ing1+" " +ing2+ " " + ing4;
		System.out.println("Black tea is prepared by adding : " +blacktea);
		
	}
}

class GreenTea extends Tea{ 
	
	String greentea;
	
	public void addSugar(String i4) { 
		ing4 = i4;
		
	}
	
	public void prepareTea(String i1, String i2) { 
		ing1 = i1;
		ing2 = i2;
		greentea = ing1+ " " +ing2+ " " + ing4;
		System.out.println("Green Tea is prepared by adding : " +greentea);
	}
	
}

class HerbalTea extends Tea{ 
	String herbaltea;
	
	public void addSugar(String i4) { 
		ing4 = i4;
		
	}
	
	public void addMilk(String i3) { 
		ing3 = i3; 
	}
	
	public void prepareTea(String i1, String i2) { 
		ing1 = i1;
		ing2 = i2;
		herbaltea = ing3+ " " +ing1+ " " +ing2+ " " +ing4;
		System.out.println("Herbal tea is prepared by adding : " +herbaltea);
	}
	
}

public class Question5 { 

	public static void main(String[] args) {
		
		Tea obj = new Tea(); 
		obj.addMilk("Milk");
		obj.addSugar("Sugar");
		obj.prepareTea("HotWater", "TeaLeaves"); 
		BlackTea obj1 = new BlackTea(); 
		obj1.addSugar("Sugar");
		obj1.prepareTea("HotWater", "TeaLeaves" ); 
		GreenTea obj2 = new GreenTea(); 
		obj2.addSugar("Sugar");
		obj2.prepareTea("HotWater", "GreenTeaLeaves");
		HerbalTea obj3 = new HerbalTea(); 
		obj3.addMilk("Milk");
		obj3.addSugar("Sugar");
		obj3.prepareTea("TeaPowder", "Ginger");		

	}

}

