/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package blackboard;

import java.util.List;

/**
 *
 * @author edemb
 */
public class Controller {

    private BlackBoard blackBoard;
    private List<KnowledgeSource> knowlefgeSources;

    public Controller(BlackBoard blackBoard, List<KnowledgeSource> knowlefgeSources) {
        this.blackBoard = blackBoard;
        this.knowlefgeSources = knowlefgeSources;
    }

    public void chooseKnowledgeSource() {

        for (KnowledgeSource ks : this.knowlefgeSources) {

            if (blackBoard.getData("problem").toString().compareTo(ks.getName())==0) {
                ks.solveProblem();
                break;
            }

        }

    }

}
