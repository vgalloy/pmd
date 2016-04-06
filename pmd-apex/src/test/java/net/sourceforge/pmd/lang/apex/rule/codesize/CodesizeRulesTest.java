/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */
package net.sourceforge.pmd.lang.apex.rule.codesize;

import net.sourceforge.pmd.testframework.SimpleAggregatorTst;

public class CodesizeRulesTest extends SimpleAggregatorTst {

    private static final String RULESET = "apex-codesize";

    @Override
    public void setUp() {
        addRule(RULESET, "TooManyFields");
        addRule(RULESET, "ExcessiveParameterList");
        addRule(RULESET, "ExcessiveClassLength");
        addRule(RULESET, "ExcessiveMethodLength");
        addRule(RULESET, "ExcessivePublicCount");
        addRule(RULESET, "StdCyclomaticComplexity");
    }
}
