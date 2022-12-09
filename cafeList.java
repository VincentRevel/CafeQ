package RPL;

public class cafeList {
    public cafe [] cafeL = new cafe[0];

    public void addCafe(cafe cafe){
        cafe [] x = cafeL;
        cafeL = new cafe[cafeL.length + 1];
        if(x.length > 0){
            for(int i = 0; i < cafeL.length; i++){
                if(i == cafeL.length - 1){

                }else{
                    cafeL[i] = x[i];
                }
            }
        }
        cafeL[cafeL.length-1] = cafe;
    }

    public void printList(){
        for(int i = 0; i < cafeL.length; i++){
            System.out.println("["+ (i+1) + "]. " + cafeL[i].getName());
        }
    }

    public int getSize(){
        return cafeL.length;
    }

    public void spesificInformation(int index){
        System.out.println("Nama       : " + this.cafeL[index].getName());
        System.out.println("No Telepon : " + this.cafeL[index].getCell());
        System.out.println("Alamat     : " + this.cafeL[index].getAddress());
        System.out.println("Ulasan     : " + this.cafeL[index].getReview());
    }
}
