interface Worker {
    void work();
}

class Engineer implements Worker {
    @Override
    public void work() {
        System.out.println("Engineering work is being done.");
    }
}

class Artist implements Worker {
    @Override
    public void work() {
        System.out.println("Artistic work is being done.");
    }
}

public class Main {
    public static void performWork(Worker worker) {
        worker.work();
    }
    public static void main(String[] args) {
        Worker engineer = new Engineer();
        Worker artist = new Artist();
        System.out.println("Calling performWork for Engineer:");
        performWork(engineer);  
        System.out.println("Calling performWork for Artist:");
        performWork(artist);
    }
}
