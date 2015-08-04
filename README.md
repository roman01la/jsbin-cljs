# ClojureScript for JS Bin

## Build

`$ lein cljsbuild once release`

## Usage

```javascript
jsbin.core.eval_expr(code, (err, output) => err ? console.error(err) : eval(res));
```
