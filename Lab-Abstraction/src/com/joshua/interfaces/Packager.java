package com.joshua.interfaces;

import com.joshua.model.Content;
import com.joshua.model.Package;

import java.awt.*;

public class Packager {
    @Override
    public Package assemblePackage() {
        Content content = generateContent();
        Color color = generateColor();
        Dimension dimension = generateDimension();

        return new Package(content, color, dimension);
    }


}
