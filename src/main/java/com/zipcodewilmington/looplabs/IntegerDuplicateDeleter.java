package com.zipcodewilmington.looplabs;

/**
 * Created by leon on 1/29/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class IntegerDuplicateDeleter extends DuplicateDeleter<Integer> {

    public IntegerDuplicateDeleter(Integer[] intArray) {
        super(intArray);
    }

    @Override
    public Integer[] removeDuplicates(int maxNumberOfDuplications) {
        int maxLength = this.array.length;
        int dupes = 0;
        Integer[] testerArray = new Integer[maxLength];
        for(int i = 0; i < this.array.length; i++){
            testerArray[i] = this.array[i];
        }
        for(int i = 0; i < testerArray.length; i++){
            dupes = 0;
            for(int j = i; j < testerArray.length; j++){
                if(testerArray[i] == testerArray[j]){
                    dupes++;
                }
                else{
                    break;
                }
            }
            if(dupes >= maxNumberOfDuplications){
                for(int x = i; x < i + dupes; x++){
                    testerArray[x] = null;
                }
                maxLength -= dupes;
            }
            i= i + dupes - 1;
        }
        Integer[] newArray = new Integer[maxLength];
        int index = 0;
        for(Integer x : testerArray){
            if(x!=null) {
                newArray[index] = x;
                index++;
            }
        }
        return newArray;
    }

    @Override
    public Integer[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        int maxLength = this.array.length;
        int dupes = 0;
        Integer[] testerArray = new Integer[maxLength];
        for(int i = 0; i < this.array.length; i++){
            testerArray[i] = this.array[i];
        }
        for(int i = 0; i < testerArray.length; i++){
            dupes = 0;
            for(int j = i; j < testerArray.length; j++){
                if(testerArray[i] == testerArray[j]){
                    dupes++;
                }
                else{
                    break;
                }
            }
            if(dupes == exactNumberOfDuplications){
                for(int x = i; x < i + dupes; x++){
                    testerArray[x] = null;
                }
                maxLength -= dupes;
            }
            i= i + dupes - 1;
        }
        Integer[] newArray = new Integer[maxLength];
        int index = 0;
        for(Integer x : testerArray){
            if(x!=null) {
                newArray[index] = x;
                index++;
            }
        }
        return newArray;
    }

//    public static void main(String[] args) {
//        Integer[] array = new Integer[]{0, 0, 0, 1, 1, 2 , 3, 3, 3, 4, 4, 5, 5, 5, 5};
//        DuplicateDeleter<Integer> deleter = new IntegerDuplicateDeleter(array);
//        deleter.removeDuplicates(2);
//    }
}
