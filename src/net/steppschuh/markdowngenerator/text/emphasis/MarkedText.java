package net.steppschuh.markdowngenerator.text.emphasis;

import net.steppschuh.markdowngenerator.text.Text;

public class MarkedText extends Text {

    public MarkedText(Object value) {
        super(value);
    }

    @Override
    public String getPredecessor() {
        return "==";
    }

}