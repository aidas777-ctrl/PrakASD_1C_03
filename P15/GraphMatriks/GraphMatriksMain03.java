package P15.GraphMatriks;

public class GraphMatriksMain03 {
    public static void main(String[] args) {
         GraphMatriks03 gdg = new GraphMatriks03(4);
        gdg.makeEdge(0,1,50);
        gdg.makeEdge(1,0,60);
        gdg.makeEdge(1,2,70);
        gdg.makeEdge(2,1,80);
        gdg.makeEdge(2,3,40);
        gdg.makeEdge(3,0,90);
        gdg.printGraph();
        System.out.println();
        System.out.println("Hasil setelah penghapusan edge");
        gdg.removeEdge(2, 1);
        gdg.printGraph();
        System.out.println();
        System.out.println("Derajat untuk setiap gedung setelah penghapusan edge:");
        gdg.printDegree();

    }
}
