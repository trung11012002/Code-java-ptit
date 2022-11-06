
import java.util.*;
import java.text.*;
class SinhVien implements Comparable<SinhVien>{
    private String ma, hoten, lop;
    private Date ns;
    private float gpa;

    public SinhVien(int n, String hoten, String lop, String ns, float gpa) throws ParseException {
        this.ma = "B20DCCN" + String.format("%03d", n);
        this.hoten = chuanHoa(hoten);
        this.lop = lop;
        this.ns = new SimpleDateFormat("dd/MM/yyyy").parse(ns);
        this.gpa = gpa;
    }
    private String chuanHoa(String s){
        StringBuilder kq = new StringBuilder();
        StringTokenizer st = new StringTokenizer(s);
        while(st.hasMoreTokens()){
            String t = st.nextToken();
            kq.append(Character.toUpperCase(t.charAt(0)));
            for(int i=1;i<t.length();i++){
                kq.append(Character.toLowerCase(t.charAt(i)));
            }
            kq.append(" ");
        }
        return kq.toString().trim();
    }

    @Override
    public String toString() {
        return ma + " " + hoten + " " + lop + " " + new SimpleDateFormat("dd/MM/yyyy").format(ns) + " " + String.format("%.2f", gpa);
    }

    @Override
    public int compareTo(SinhVien o) {
        if(this.gpa > o.gpa) return -1;
        if(this.gpa < o.gpa) return 1;
        return 0;
    }
    
}
public class Main {
    public static void main(String[] args) throws ParseException {
        ArrayList<SinhVien> ds = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        for(int i=1;i<=n;i++){
            SinhVien tmp = new SinhVien(i,in.nextLine(),in.nextLine(),in.nextLine(), Float.parseFloat(in.nextLine()));
            ds.add(tmp);
        }
        Collections.sort(ds);
        for(SinhVien tmp : ds){
            System.out.println(tmp);
        }
    }
}

