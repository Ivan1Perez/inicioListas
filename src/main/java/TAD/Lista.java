package TAD;

public class Lista {

    private int size;
    private Node cabeza;
    private Node cola;

    public Lista(){
        size=0;
        cabeza=null;
    }

    public boolean isEmpty(){
        return cabeza==null;
    }

    public int size(){
        return size;
    }

    public int[] toArray(){
        int[] array = new int[size];

        Node aux = cabeza;

        for(int i=0;i<size;i++,aux=aux.getNext()){
            array[i]= aux.getInfo();
        }

        return array;
    }

//    public void remove(int index){
//
//        if(index<size || index>0){
//            Node aux = cabeza;
//
//            while(index>0){
//                aux=aux.getNext();
//
//                index--;
//            }
//
//            info = null;
//            size--;
//        }


    }


    public void addHead(int numero){
        Node node = new Node(numero);

        if(cabeza==null) {
            cabeza = node;
            cola = node;
        }else {
            node.setNext(cabeza);
            cabeza=node;
        }

        size++;
    }
//    public void addHead(int numero){
//        Node node = new Node(numero);
//
//        if(cabeza==null)
//            cabeza= node;
//        else {
//            node.setNext(cabeza);
//            cabeza=node;
//        }
//
//        size++;
//    }

    public boolean contains(int numero){

        boolean encontrado = false;

        Node aux = cabeza;

        while(aux!=null && !encontrado)
            if(aux.getInfo()==numero)
                encontrado = true;
            else
                aux = aux.getNext();

        return encontrado;
    }

    public Integer get(int index){
        if(index>=size || index<0)
            return null;

        Node aux = cabeza;
        while (index>0){
            aux=aux.getNext();
            index--;
        }

        return aux.getInfo();
    }

    public void clear(){
        cabeza =null;
        cola=null;
        size=0;
    }
    public void addTail(int numero){
        Node node = new Node(numero);

        if(cabeza==null) {
            cabeza = node;
            cola = node;
        }else{
            cola.setNext(node);
            cola = node;
        }
        size++;
    }
//    public void addTail(int numero){
//        Node node = new Node(numero);
//
//        if(cabeza==null)
//            cabeza = node;
//        else{
//            Node aux = cabeza;
//            while(aux.getNext()!=null)
//                aux=aux.getNext();
//
//            aux.setNext(node);
//        }
//        size++;
//    }

    @Override
    public String toString() {
        return "Lista{" +
                "size=" + size +
                ", valores = " + cabeza +
                '}';
    }

}
