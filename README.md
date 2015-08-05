# ClojureScript for JS Bin

## Build

`$ lein cljsbuild once release`

## Usage

Use compiled js in `out/jsbin-cljs.js`
```javascript
jsbin_cljs.core.eval_expr(code, (err, output) => err ? console.error(err) : eval(output));
```
