/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.jbehave.core.story.codegen.sablecc.parser;

import org.jbehave.core.story.codegen.sablecc.node.*;
import org.jbehave.core.story.codegen.sablecc.analysis.*;

class TokenIndex extends AnalysisAdapter
{
    int index;

    public void caseTTitleKeyword(TTitleKeyword node)
    {
        index = 0;
    }

    public void caseTPackageKeyword(TPackageKeyword node)
    {
        index = 1;
    }

    public void caseTScenarioKeyword(TScenarioKeyword node)
    {
        index = 2;
    }

    public void caseTAsA(TAsA node)
    {
        index = 3;
    }

    public void caseTIWant(TIWant node)
    {
        index = 4;
    }

    public void caseTSoThat(TSoThat node)
    {
        index = 5;
    }

    public void caseTGiven(TGiven node)
    {
        index = 6;
    }

    public void caseTWhen(TWhen node)
    {
        index = 7;
    }

    public void caseTThen(TThen node)
    {
        index = 8;
    }

    public void caseTSpace(TSpace node)
    {
        index = 9;
    }

    public void caseTWord(TWord node)
    {
        index = 10;
    }

    public void caseTPackageName(TPackageName node)
    {
        index = 11;
    }

    public void caseTEndl(TEndl node)
    {
        index = 12;
    }

    public void caseEOF(EOF node)
    {
        index = 13;
    }
}