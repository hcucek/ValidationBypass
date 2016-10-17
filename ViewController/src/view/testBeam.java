package view;

import java.io.Serializable;

import javax.faces.event.ActionEvent;

import oracle.adf.view.rich.render.ClientEvent;

import org.apache.myfaces.trinidad.component.UIXCommand;

public class testBeam implements Serializable {
    public testBeam() {
    }

    public void customButtonActionListener(ClientEvent clientEvent) {  
        UIXCommand cb = (UIXCommand) clientEvent.getComponent();  
        cb.broadcast(new ActionEvent(cb));  
    }

    public void buttonActionListener(ActionEvent actionEvent) {
        System.out.println("Cancel akcija odradjena!");   
    }

    public void okButton(ActionEvent actionEvent) {
        System.out.println("OK akcija odradjena!");    
    }
}
