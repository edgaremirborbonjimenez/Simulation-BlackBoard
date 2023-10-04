/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package blackboard;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author edemb
 */
public class BlackBoard {

    private Map<String, Object> sharedData = new HashMap<>();

    public void updateData(String key, Object value) {
        sharedData.put(key, value);
    }

    public Object getData(String key) {
        return sharedData.get(key);
    }

    public void changeProblem() {

        if (getData("problem").toString().compareTo("suma")==0) {
            sharedData.put("problem", "multi");

        } else {
            sharedData.put("problem", "suma");

        }
    }
}
