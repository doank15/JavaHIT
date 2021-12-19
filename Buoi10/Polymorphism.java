public class Polymorphism {
    public static void main(String[] args){
        Cat x = new Cat();
        Animal a = new Animal();
        x.getClazz();
        a.getClazz();
        x.sleep(2, 5, "GDUCKY");
    }
}
/**
 * Lưu dữ liệu thì dùng ArrayList
 * Thêm sửa xóa thì dùng LinkedList 
 * 
 */