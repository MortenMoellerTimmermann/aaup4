package com.company.Generator;

import java.util.*;
import com.company.Visitor.*;
import com.company.ASTnodes.*;

public class Target
{
    public String M_ONE;
    public String M_TWO;
    public String M_TARGET;


    public String Device (String name)
    {
        switch (name) {
            case "M_ONE":
                return "device_" + M_ONE;
            case "M_TWO":
                return "device_" + M_TWO;
            case "TARGET":
                return "device_" + M_TARGET;
        }

        return "";
    }

    public String Host (String name)
    {
        switch (name) {
            case "M_ONE":
                return "host_" + M_ONE;
            case "M_TWO":
                return "host_" + M_TWO;
            case "TARGET":
                return "host_" + M_TARGET;
        }
        
        return "";
    }
}
