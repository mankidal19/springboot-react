var path = require('path');

module.exports = {
    // webpack must know this in order to know what to launch 
    // when the final bundle is loaded by the browser.
    entry: './src/main/js/app.js',
    // useful for debugging JS code in the browser, as it will link back to original source code.
    devtool: 'sourcemaps',
    cache: true,
    mode: 'development',
    // ALL the js bits will be compiled onto below path/file
    output: {
        path: __dirname,
        filename: './src/main/resources/static/built/bundle.js'
    },
    module: {
        rules: [
            {
                test: path.join(__dirname, '.'),
                exclude: /(node_modules)/,
                use: [{
                    loader: 'babel-loader',
                    options: {
                        presets: ["@babel/preset-env", "@babel/preset-react"]
                    }
                }]
            }
        ]
    }
};