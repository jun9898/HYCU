package list.arraylist.api;
import java.util.Objects;

public class ArrayList {
    private int size = 0; //몇개의 데이터가 리스트에 들어있는지
    private Object[] elementData = new Object[100]; // 내부적으로 사용할 Object 를 만들었다. 최대 몇개의 데이터가 리스트에 들어가는지

    public boolean addLast(Object element) { // ArrayList 마지막에 element 를 추가해주는 메소드
        elementData[size] = element;         // size 값에 해당되는 위치에 element 를 추가
        size++;                              // element 하나가 추가되어 총 size 의 크기도 1 증가
        return true;
    }

    public boolean add(int index, Object element) { //내 입력한 index 값에 element 를 대입해야 한다.
        for ( int i = size-1; i >= index; i--){     //총 index 는 0부터 세기때문에 size 에서 -1을 해준다. i 의 값이 내가 입력한 index 의 값보다 크거나 같을때 i의 값을 1씩 감소시키며 반복.
            elementData[i+1] = elementData[i];      //i+1의 값에 i 를 대입해줘 element 값이 들어갈 index 를 비워준다.
        }
        elementData[index] = element;               //비워진 해당 index 에 element 값을 대입
        size++;                                     //ArrayList 의 전체값이 증가하였으므로 size 값을 1 더해준다.
        return true;
    }

    public boolean addFirst(Object element){ // 첫번째에 내가 입력한 element를 추가해주는 법
        return add(0, element);        // 내가 미리 만들어놓은 add 매소드를 사용해 index 0번에 element 를 할당해준다.
    }

    public String toString() { //numbers 에 속해있는 수를 모두 표시해준다.
        String str = "[";
        for (int i = 0; i < size; i++){   //i 의 값이 size 의 값보다 작은동안 i를 1씩 증가시키며 반복한다.
            str += elementData[i];  // elementData 의 모든값은 String 형식으로 추가한다.
            if (i < size-1) {   // 만약 i 의 값이 size 보다 크면 ,를 생략한다.
                str += ",";     // 콤마 추가는 필수
            }
        }
        return str + "]";   // 괄호 닫기
    }
    public Object remove(int index) { //내 입력한 index 값에 element 를 삭제해야 한다.
        Object removed = elementData[index];
        for ( int i = index + 1; i <= index; i++){    //i 의 값이 내가 입력한 index 의 값보다 작거나 같을때 i의 값을 1씩 증가시키며 반복.
            elementData[i-1] = elementData[i];      //i-1의 값에 i 를 대입해준다.
        }
        size--;                                     //ArrayList 의 전체값이 증감하였으므로 size 값을 1빼준다.
        elementData[size] = null;                   //ArrayList 의 빈 칸을 지워준다.
        return removed;                             //print 기능을 사용했을 때 지워진 element를 리터하여 어떤수가 지워졌는지 알려준다.
    }

    public Object removeFirst(){ // remove 매서드를 사용하여 손쉽게 첫번째 위치를 지워준다.
        return remove(0);
    }

    public Object removeLast(){ // remove 매서드를 사용하여 손쉽게 마지막 위치를 지워준다.
        return remove(size-1);
    }

    public Object get(int index) { // index 값을 입력받아 elementData 의 값을 리턴해준다.
        return elementData[index]; // ArrayList 의 큰 장점은 index 값을 이용하여 접근시 빠른 작업이 가능하다
    }

    public int size(){ // 전체 사이즈 리턴하기
        return size;
    }

    public int indexOf(Object o){ // o 와 일치하는 값을 찾으면 리턴한다.
        for(int i=0; i < size; i++){
            if(o.equals(elementData[i])){
                return i;
            }
        }
        return -1;
    }

    public ListIterator listIterator(){ //ListIterator class를 생성하고 순환시켜 리스트 내부에 있는 값을 리턴한다.
        return new ListIterator();
    }

    class ListIterator{
        private int nextIndex = 0;
        public  boolean hasNext(){
            return nextIndex < size();
        }
        public Object next() {
//            Object returnData = elementData[nextIndex];
//            nextIndex++;
//            return returnData;
//        }
            return elementData[nextIndex++];
        }
        public Object previous(){
            return elementData[--nextIndex];
        }
        public  boolean hasPrevious(){
            return nextIndex > 0;
        }
        public void add(Object element){
            ArrayList.this.add(nextIndex++, element);
        }
        public void remove(Object element){
            ArrayList.this.remove(nextIndex-1);
            nextIndex--;
        }
    }
}
