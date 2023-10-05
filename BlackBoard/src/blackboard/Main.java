/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package blackboard;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author edemb
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BlackBoard blackBoard = new BlackBoard();
        blackBoard.updateData("problem", "suma");
        blackBoard.updateData("a", 4);
        blackBoard.updateData("b", 4);
        KnowledgeSource kn = new KnowledgeSourceSum("suma", blackBoard);
        KnowledgeSource kn1 = new KnowledgeSourceMult("multi", blackBoard);

        List<KnowledgeSource> knowledgeSources = new ArrayList<>();
        knowledgeSources.add(kn);
        knowledgeSources.add(kn1);

        Controller controller = new Controller(blackBoard, knowledgeSources);

        System.out.println(blackBoard.getData("problem"));
        controller.chooseKnowledgeSource();
        System.out.println("resultado = " + blackBoard.getData("resultado"));
        
        
        System.out.println(blackBoard.getData("problem"));
        controller.chooseKnowledgeSource();
        System.out.println("resultado = " + blackBoard.getData("resultado"));

    }

}
