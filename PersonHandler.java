 

/**
 * Created by leon on 1/24/18.
 */
public class PersonHandler {
    private final Person[] personArray;

    public PersonHandler(Person[] personArray) {
        this.personArray = personArray;
    }

    public String whileLoop() {
        String result = "";
        String stringRepresentation = "";
        Person currentPerson;
        int i = 0;
        
        while (i < personArray.length) {  
         currentPerson = personArray[i];
         stringRepresentation = currentPerson.toString();
         result += stringRepresentation;
         i++;
        }
        return result;
    }



    public String forLoop() {
        String result = "";
        String stringRepresentation = "";
        Person currentPerson;

        for(int i = 0; i < personArray.length; i++) {
                currentPerson = personArray[i];
                stringRepresentation = currentPerson.toString();
                result += stringRepresentation;
                
        }
    
        // use the above clauses to declare for-loop signature
            // begin loop
                // use `counter` to identify the `current Person` in the array
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable
            // end loop

        return result;
    }
    



    public String forEachLoop() {
        String result = "";
        String stringRepresentation = "";
        
        
        // identify array's type
        // identify array's variable-name
        for (Person currentPerson: personArray) {
            stringRepresentation = currentPerson.toString();
            result += stringRepresentation;
            
        // use the above discoveries to declare for-each-loop signature
            // begin loop
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable
            // end loop
        }
        return result;
    }


    public Person[] getPersonArray() {
        return personArray;
    }
}
