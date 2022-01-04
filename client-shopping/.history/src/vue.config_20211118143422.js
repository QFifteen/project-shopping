module.exports = {
    css: {
        loaderOptions: {
            less: {
                javascriptEnabled: true,
                import: resolve("assets/")
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