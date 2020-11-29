import java.util.LinkedList;

abstract class Animal {
    private int order;
	protected String name;

	public Animal(String name) {
		this.name = name;
	}

	public void setOrder(int order) {
		this.order = order;
	}

	public int getOrder() {
		return order;
	}

	public boolean isOlderThan(Animal a) {
		return this.order < a.getOrder();
	}
}

class Dog extends Animal {
	public Dog(String name) {
		super(name);
	}
}

class Cat extends Animal {
	public Cat(String name) {
		super(name);
	}
}

public class AnimalShelter {
	LinkedList<Dog> dogs = new LinkedList<>();
	LinkedList<Cat> cats = new LinkedList<>();
	private int order = 0;

	public void enqueue(Animal a) {
		a.setOrder(order);
		order++;
		if (a instanceof Dog) {
			dogs.addLast((Dog) a);
		}
		if (a instanceof Cat) {
			cats.addLast((Cat) a);
		}
	}

	public Animal dequeueAny() {
		if (dogs.size() == 0 && cats.size() == 0) {
			return null;
		}
		if (dogs.size() == 0) {
			return dequeueCats();
		}
		if (cats.size() == 0) {
			return dequeueDogs();
		}
		Dog dog = dogs.peek();
		Cat cat = cats.peek();
		if (dog.isOlderThan(cat)) {
			return dequeueDogs();
		} else {
			return dequeueCats();
		}
	}

	public Animal dequeueDogs() {
		return dogs.poll();
	}

	public Animal dequeueCats() {
		return cats.poll();
	}
}
