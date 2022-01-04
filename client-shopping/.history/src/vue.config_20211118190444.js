const path = require("path");
module.exports = {
    css: {
        loaderOptions: {
            less: {
                javascriptEnabled: true,
                import: resolve("assets/css/style.less")
            }
        },
        pluginOptions: {
                     "style-resources-loader": {
                         preProcessor: "less",
                         patterns: [path.resolve(__dirname, "less文件路径")]
                     }
                }
    },
    
    devServer: {
        historyApiFallback: true
      },
    //   module: {
    //     rules: [
    //      {
    //      test: /\.less$/,
    //      loader: 'style-loader!css-loader!less-loader'
    //      },
    //      {
    //      test:/\.css$/,
    //      loader:'css-loader!style-loader',
    //      }
    //     ] 
    //     }  
}