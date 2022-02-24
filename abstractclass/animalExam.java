package abstractclass;


public class animalExam {

	public static void main(String[] args) {

		Dog dog = new Dog("큰개1");
		Cat cat = new Cat("큰 고양이1");
		Ham ham = new Ham("와우 큰쥐");
		
		System.out.println(dog.kind);
		System.out.println(cat.kind);
		System.out.println(ham.kind);
		
		System.out.println("-------------------");
		
		dog.sound();
		cat.sound();
		ham.sound();
		
		
		System.out.println("-------------------");
		
		Animal animal = null;
		
		animal = new Dog("포유류");
		animal.sound();
		
		animal = new Cat("포유류");
		animal.sound();
		
		
		
		
		Animal animal0 = new Dog(dog.kind);
		animal.sound();
		
		Animal animal1 = new Cat(cat.kind);
		animal1.sound();
		
		Animal animal2 = new Ham(ham.kind);
		animal2.sound();
		
		System.out.println("-------------------");
		
		animalsound(new Dog());
		animalsound(new Cat());
		
		

	}

	public static void animalsound(Animal animal) {
		animal.sound();

	}
}
