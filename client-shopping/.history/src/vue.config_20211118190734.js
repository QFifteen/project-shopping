const path = require("path");
module.exports = {
    css: {
        loaderOptions: {
            less: {
                javascriptEnabled: true,
            }
        },
        pluginOptions: {
                     "style-resources-loader": {
                         preProcessor: "less",
                         patterns: [path.resolve(__dirname, "assets/css/style.less")]
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