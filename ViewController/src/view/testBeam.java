package view;

import java.io.Serializable;

import javax.faces.event.ActionEvent;

import oracle.adf.view.rich.render.ClientEvent;

import org.apache.myfaces.trinidad.component.UIXCommand;

public class testBeam implements Serializable {
    
    String natpis = new String();
    StringBuilder log = new StringBuilder();
    public testBeam() {
    }

    public void customButtonActionListener(ClientEvent clientEvent) {  
        UIXCommand cb = (UIXCommand) clientEvent.getComponent();  
        cb.broadcast(new ActionEvent(cb));  
    }

    public void buttonActionListener(ActionEvent actionEvent) {
        System.out.println("Cancel akcija odradjena!");   
        log.append("Cancel! \n");
    }

    public void okButton(ActionEvent actionEvent) {
        System.out.println("OK akcija odradjena!");    
        log.append("Ok \n");
    }

    public void clearButton(ActionEvent actionEvent) {
        System.out.println("Clear akcija odradjena!");    
        log = new StringBuilder();
    }

    public void setNatpis(String natpis) {
        this.natpis = natpis;
    }

    public String getNatpis() {
        return "Log: \n"+ log.toString();
    }
}
