package com.projectgalen.app.srcgen.json;
// ================================================================================================================================
//     PROJECT: SourceGenerator
//    FILENAME: Primitives.java
//         IDE: IntelliJ IDEA
//      AUTHOR: Galen Rhodes
//        DATE: July 26, 2024
//
// Copyright © 2024 Project Galen. All rights reserved.
//
// Permission to use, copy, modify, and distribute this software for any purpose with or without fee is hereby granted, provided
// that the above copyright notice and this permission notice appear in all copies.
//
// THE SOFTWARE IS PROVIDED "AS IS" AND THE AUTHOR DISCLAIMS ALL WARRANTIES WITH REGARD TO THIS SOFTWARE INCLUDING ALL IMPLIED
// WARRANTIES OF MERCHANTABILITY AND FITNESS. IN NO EVENT SHALL THE AUTHOR BE LIABLE FOR ANY SPECIAL, DIRECT, INDIRECT, OR
// CONSEQUENTIAL DAMAGES OR ANY DAMAGES WHATSOEVER RESULTING FROM LOSS OF USE, DATA OR PROFITS, WHETHER IN AN ACTION OF CONTRACT,
// NEGLIGENCE OR OTHER TORTIOUS ACTION, ARISING OUT OF OR IN CONNECTION WITH THE USE OR PERFORMANCE OF THIS SOFTWARE.
// ================================================================================================================================

import org.jetbrains.annotations.NotNull;

public enum Primitives {
/*@f0*/
    BOOLEAN("boolean", "Boolean",   "parseBoolean(%s)",                   false),
    CHAR("char",       "Character", "(%s.isEmpty() ? 0 : %<s.charAt(0))", false),
    BYTE("byte",       "Byte",      "parseByte(%s)",                      true),
    SHORT("short",     "Short",     "parseShort(%s)",                     true),
    INT("int",         "Integer",   "parseInt(%s)",                       true),
    LONG("long",       "Long",      "parseLong(%s)",                      true),
    FLOAT("float",     "Float",     "parseFloat(%s)",                     true),
    DOUBLE("double",   "Double",    "parseDouble(%s)",                    true);
/*@f1*/
    private final @NotNull String  primitiveName;
    private final @NotNull String  wrapperName;
    private final          boolean isNumeric;
    private final @NotNull String  wrapperParserCode;

    Primitives(@NotNull String primitiveName, @NotNull String wrapperName, @NotNull String wrapperParserCode, boolean isNumeric) {
        this.isNumeric         = isNumeric;
        this.primitiveName     = primitiveName;
        this.wrapperName       = wrapperName;
        this.wrapperParserCode = wrapperParserCode;
    }

    public @NotNull String getPrimitiveName() {
        return primitiveName;
    }

    public @NotNull String getWrapperName() {
        return wrapperName;
    }

    public @NotNull String getWrapperParserCode() {
        return wrapperParserCode;
    }

    public boolean isNumeric() {
        return isNumeric;
    }
}
