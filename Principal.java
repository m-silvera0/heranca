public class Principal {
    public static void main(String[] args) {
        Dog dog = new Dog("Pitchula",1);
    
        Dog dog1 = new Dog("Lindo",5);
    
    
    
    
        Cat cat = new Cat("Ronildo Frederico",3);
    
    
    
    
        System.out.println("Nome do(a) cachorro(a): " + dog.getNome());
    
        System.out.println("Idade do(a) cachorro(a): " + dog.getIdade());
    
    
    
    
        System.out.println("Nome do(a) cachorro(a): " + dog1.getNome());
    
        System.out.println("Idade do(a) cachorro(a): " + dog1.getIdade());
    
    
    
    
        System.out.println("Nome do(a) gatinho(a): " + cat.getNome());
    
        System.out.println("Idade do(a) cachorro(a): " + cat.getIdade());
    
    
    
    
        }
    
    }