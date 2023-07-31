package com.zipcodewilmington.looplabs;

/**
 * Created by leon on 1/28/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class StringDuplicateDeleter extends DuplicateDeleter<String> {
    public StringDuplicateDeleter(String[] intArray) {
        super(intArray);
    }

    @Override
    public String[] removeDuplicates(int maxNumberOfDuplications) {
        int maxLength = this.array.length;
        int dupes = 0;
        String[] testerArray = new String[maxLength];
        for(int i = 0; i < this.array.length; i++){
            testerArray[i] = this.array[i];
        }
        for(int i = 0; i < testerArray.length; i++){
            dupes = 0;
            for(int j = i; j < testerArray.length; j++){
                if(testerArray[i].equals(testerArray[j])){
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
        String[] newArray = new String[maxLength];
        int index = 0;
        for(String x : testerArray){
            if(x!=null) {
                newArray[index] = x;
                index++;
            }
        }
        return newArray;
    }

    @Override
    public String[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        int maxLength = this.array.length;
        int dupes = 0;
        String[] testerArray = new String[maxLength];
        for(int i = 0; i < this.array.length; i++){
            testerArray[i] = this.array[i];
        }
        for(int i = 0; i < testerArray.length; i++){
            dupes = 0;
            for(int j = i; j < testerArray.length; j++){
                if(testerArray[i].equals(testerArray[j])){
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
        String[] newArray = new String[maxLength];
        int index = 0;
        for(String x : testerArray){
            if(x!=null) {
                newArray[index] = x;
                index++;
            }
        }
        return newArray;
    }
}
