public class Main {
    public static void main(String[] args) {


        ArraySum sumObj = new ArraySum();
        sumObj.setLength();
        sumObj.calculateSum();


        AverageSum avgObj = new AverageSum();
        avgObj.setLength();
        avgObj.calculateSum();


        CertainValue valueObj = new CertainValue();
        valueObj.setLength();
        valueObj.valueInArray();
        valueObj.searchValue();

        ArrayIndex obj = new ArrayIndex();
        obj.setLength();
        obj.setValues();
        obj.findIndex();

        ItterationArray iterobj = new ItterationArray();
        iterobj.setLength();
        iterobj.setValues();
        iterobj.copyArray();

        CommonElements twoobj = new CommonElements();
        twoobj.setLength();
        twoobj.setValues();
        twoobj.findCommon();

        CommonElementsInteger intobj = new CommonElementsInteger();
        intobj.setLength();
        intobj.setValues();
        intobj.findCommon();

        SecondLargest secondobj = new SecondLargest();
        secondobj.setLength();
        secondobj.setElements();
        secondobj.findSecondLargest();

        SecondSmallest smallobj = new SecondSmallest();
        smallobj.setLength();
        smallobj.setElements();
        smallobj.findSecondSmallest();











    }
}
