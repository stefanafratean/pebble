/*******************************************************************************
 * This file is part of Pebble.
 *
 * Copyright (c) 2014 by Mitchell Bösecke
 *
 * For the full copyright and license information, please view the LICENSE
 * file that was distributed with this source code.
 ******************************************************************************/
package com.mitchellbosecke.pebble.node;

import com.mitchellbosecke.pebble.extension.NodeVisitor;
import com.mitchellbosecke.pebble.node.expression.Expression;
import com.mitchellbosecke.pebble.template.EvaluationContext;
import com.mitchellbosecke.pebble.template.PebbleTemplateImpl;

/**
 * The right hand side to the test expression.
 *
 * @author Mitchell
 *
 */
public class TestInvocationExpression implements Expression<Object> {

    private final String testName;

    private final ArgumentsNode args;

    private final int lineNumber;

    @Override
    public Object evaluate(PebbleTemplateImpl self, EvaluationContext context) {
        throw new UnsupportedOperationException();
    }

    public TestInvocationExpression(int lineNumber, String testName, ArgumentsNode args) {
        this.testName = testName;
        this.args = args;
        this.lineNumber = lineNumber;
    }

    @Override
    public void accept(NodeVisitor visitor) {
        visitor.visit(this);
    }

    public ArgumentsNode getArgs() {
        return args;
    }

    public String getTestName() {
        return testName;
    }

    @Override
    public int getLineNumber() {
        return this.lineNumber;
    }
}
