# java-exercises-practice-for-junior
I'm dropping some of the projects im making while studiying Java. I'll be uploading when i get more...

<h1>📌 JAVA STRUCTURE AND FUNDAMENTAL BLOCKS — SUMMARY</h1>

<h2>1. <strong>Basic Structure</strong></h2>
<ul>
  <li><strong>Main class</strong>: Every Java program has one public class whose name matches the file name.</li>
  <li><strong>Main method</strong>: Program entry point:
    <br><code>public static void main(String[] args)</code></li>
  <li>May contain additional user-defined classes.</li>
</ul>

<h2>2. <strong>Comments</strong></h2>
<ul>
  <li><strong>Single-line</strong>: <code>//</code></li>
  <li><strong>Multi-line</strong>: <code>/* ... */</code></li>
  <li><strong>Javadoc</strong>: <code>/** ... */</code></li>
</ul>

<h2>3. <strong>Identifiers</strong></h2>
<ul>
  <li>Must start with a <strong>letter, _, or $</strong>.</li>
  <li>Cannot contain spaces or start with a number.</li>
  <li><strong>Case sensitive</strong>.</li>
  <li>Cannot use <strong>reserved keywords</strong>.</li>
</ul>

<h2>4. <strong>Naming Conventions</strong></h2>

<h3>Classes and Interfaces</h3>
<ul>
  <li><strong>CamelCase</strong>, starting with uppercase.</li>
  <li>Classes → nouns.</li>
  <li>Interfaces → adjectives.</li>
</ul>

<h3>Methods and Variables</h3>
<ul>
  <li>camelCase, starting with lowercase.</li>
  <li>Methods → verb + noun.</li>
  <li>Variables → meaningful nouns.</li>
</ul>

<h3>Constants</h3>
<ul>
  <li><strong>ALL_CAPS_WITH_UNDERSCORES</strong></li>
</ul>

<h2>5. <strong>Data Types</strong></h2>

<h3>Primitive Types</h3>
<ul>
  <li><strong>boolean, char</strong></li>
  <li><strong>Integer types</strong>: byte, short, int, long</li>
  <li><strong>Floating types</strong>: float, double</li>
  <li>Can use “_” for readability: <code>1_000_000</code></li>
</ul>

<h3>Reference Types</h3>
<ul>
  <li>Store a <strong>reference to an object</strong>.</li>
</ul>

<h2>6. <strong>Variables</strong></h2>
<ul>
  <li>Java is <strong>statically typed</strong>.</li>
  <li>Variables must be declared before use.</li>
</ul>

<h3>Types of Variables</h3>
<ul>
  <li><strong>Instance variables</strong>: object attributes.</li>
  <li><strong>Class/static variables</strong>: shared among all objects.</li>
  <li><strong>Local variables</strong>: inside methods → must be initialized.</li>
</ul>

<h2>7. <strong>Variable Scope</strong></h2>
<ul>
  <li><strong>Class scope</strong>: attributes.</li>
  <li><strong>Method scope</strong>: parameters.</li>
  <li><strong>Local scope</strong>: inside a method.</li>
  <li><strong>Block scope</strong>: inside braces <code>{}</code>.</li>
  <li>Inner scope variables override outer scope variables.</li>
</ul>

<h2>8. <strong>Constants</strong></h2>
<ul>
  <li>Declared with <strong>final</strong>.</li>
  <li>Must be initialized at declaration.</li>
</ul>

<h2>9. <strong>Operators and Expressions</strong></h2>

<h3>Arithmetic Operators</h3>
<ul>
  <li><code>+ - * / %</code></li>
  <li>Integer vs real division depends on operand types.</li>
</ul>

<h3>Unary Operators</h3>
<ul>
  <li><code>++</code>, <code>--</code>, <code>+</code>, <code>-</code></li>
</ul>

<h3>Relational Operators</h3>
<ul>
  <li><code>&lt;, &gt;, &lt;=, &gt;=, ==, !=</code></li>
</ul>

<h3>Logical Operators</h3>
<ul>
  <li><strong>Short circuit</strong>: <code>&amp;&amp;</code>, <code>||</code></li>
  <li><strong>Non-short circuit</strong>: <code>&amp;</code>, <code>|</code></li>
  <li><strong>XOR</strong>: <code>^</code></li>
  <li><strong>Negation</strong>: <code>!</code></li>
</ul>

<h3>Assignment Operators</h3>
<ul>
  <li><code>=</code>, <code>+=</code>, <code>-=</code>, etc.</li>
</ul>

<h3>Operator Precedence</h3>
<ul>
  <li>Expressions follow a <strong>precedence hierarchy</strong>.</li>
  <li>Parentheses override priority.</li>
</ul>

<h2>10. <strong>Boolean Expressions</strong></h2>
<ul>
  <li>Result: <strong>true</strong> or <strong>false</strong>.</li>
  <li>Use relational and logical operators.</li>
</ul>

<h2>11. <strong>Ternary Operator</strong></h2>
<p><code>condition ? value1 : value2</code></p>

<h2>12. <strong>Type Conversions (Casting)</strong></h2>

<h3>Implicit Conversion</h3>
<ul>
  <li>Small → larger type automatically.</li>
</ul>

<h3>Explicit Conversion</h3>
<ul>
  <li>Larger → smaller type (may lose data).</li>
  <li>Example: <code>(int) 3957.67 → 3957</code></li>
  <li>Not allowed for <strong>boolean</strong> or arbitrary classes.</li>
</ul>

<h2>13. <strong>Primitive Assignments</strong></h2>
<ul>
  <li>An integer literal is always an <strong>int</strong> by default.</li>
  <li>Expressions with ints produce ints → may require casting for smaller types.</li>
</ul>


</html>

