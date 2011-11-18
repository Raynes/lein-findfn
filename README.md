# lein-findfn

This is a little Leiningen plugin for finding functions/macros that do what you want to do.

`lein findfn` takes a set of input values and an expected output value and then looks for functions in clojure.core, clojure.set, and clojure.string that, when called with those input values, return the output value you want.

`lein findarg` is similar, but it looks up a function to pass to a higher order function to get what you want. This is best demonstrated with an example:

```
$ lein findarg map % [1 2 3] [2 3 4]
clojure.core/unchecked-inc
clojure.core/inc
```

In the above examples, % is the mysterious function that you're looking for.

P.S.: This isn't necessarily guarenteed to work properly. ;)

## Usage

    lein plugin install lein-findfn 0.1.0
    lein findfn 2 3 5
    lein findarg map % [1 2 3] [2 3 4]

Keep in mind that you have to respect how your shell parses arguments. For example, this works:

    lein findarg map % [\\a \\b \\c] [\"a\" \"b\" \"c\"]

but this doesn't:

    lein findarg map % [\a \b \c] ["a" "b" "c"]

## License

Copyright (C) 2011 Anthony Grimes, Alan Malloy, Joshua Cole

Distributed under the Eclipse Public License, the same as Clojure.
