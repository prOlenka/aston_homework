package aston_homework;



public class ProjectApplication {

	public static void main(String[] args) {
		// Создаем список для хранения строк
		CustomArrayList<String> list = new CustomArrayList<>();

		// Добавляем элементы
		list.add(0, "Привет");
		list.add(1, "Мир");
		list.add(2, "Java");

//		// Выводим элементы
//		System.out.println(list.get(0)); // Привет
//		System.out.println(list.get(1)); // Мир
//		System.out.println(list.get(2)); // Java
	}

}
