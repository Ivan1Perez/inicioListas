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

    public Integer remove(int index){
        if(index>=size||index<0){
            return null;
        }

        Integer value = null;

        if(index==0){
            value = cabeza.getInfo();
            cabeza = cabeza.getNext();
        }else{
            Node aux = cabeza;
            Node aux2 = cabeza.getNext();

            while(index>1){
                aux=aux2;
                aux2=aux2.getNext();
                index--;
            }
            value = aux2.getInfo();
            aux.setNext(aux2.getNext());
        }

        size--;
        return value;
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

    public boolean addAll(Lista l){

        boolean modificado = false;
        Node aux = l.cabeza;
        int i = size;

        while(aux!=null && i>0){
            modificado=true;
            addTail(aux.getInfo());
            aux=aux.getNext();
            i--;
        }

        return modificado;
    }

    @Override
    public boolean equals(Object obj){
        if(obj instanceof Lista){
            Lista l = (Lista) obj;
            if(l.size!=size)
                return false;

            boolean encontrado = false;
            Node aux = cabeza;
            Node aux2 = l.cabeza;
            while (aux!=null && !encontrado){
                if(!aux.equals(aux2))
                    encontrado=true;

                aux = aux.getNext();
                aux2 = aux2.getNext();
            }

            return !encontrado;
        }

        return false;
    }


    @Override
    public String toString(){
        return "{ size: "+size +", Values: " +((cabeza==null)?"}":cabeza.toString());
    }


}
