# ClojureScript for JS Bin

## Build

`$ lein cljsbuild once release`

## Usage

Use compiled js in `out/jsbin-cljs.js`

```javascript
jsbin_cljs.core.eval(
  '(take 4 (range 0 10))',
  function (err, res) {
    if (err) {
      console.error(err);
    } else {
      console.log(res.toString());
    }
  });

// (0 1 2 3)
```
