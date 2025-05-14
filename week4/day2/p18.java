class Buffer{
   int capacity;
   int[] buffer;
   int head = 0;
   int size = 0;
   int tail = 0;
   Buffer(int capacity){
       this.capacity = capacity;
       this.buffer = new int[capacity];
   }
   void insert(int num){
       buffer[tail] = num;
       tail = (tail+1)%capacity;

       if(size<capacity){
           size++;
       }
       else{
           head = (head + 1)%capacity;
       }
   }
   void displayBuffer(){
       for (int i =0; i< size;i++){
           System.out.println(buffer[(head + i)%capacity]);
       }
   }

}
public class Main  {
   public static void main(String[] args) {
       Buffer obj = new Buffer(5);
       obj.insert(1);
       obj.insert(2);
       obj.insert(3);
       obj.insert(4);
       obj.insert(5);
       obj.insert(6);
       obj.displayBuffer();
   }
}